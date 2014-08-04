package com.bitcoin.web;

import java.io.File;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.kits.WalletAppKit;
import com.google.bitcoin.params.TestNet3Params;

public class WebWallet {

    private WalletAppKit kit;
    private String filePrefix;
    
    public WebWallet(String filePrefix){
    	this.filePrefix = filePrefix;
    }

    public void start() {
        NetworkParameters params = TestNet3Params.get();

        // Start up a basic app using a class that automates some boilerplate.
        kit = new WalletAppKit(params, new File("D:/tools/Bitcoin/bitcoinj"), filePrefix);

        // Download the block chain and wait until it's done.
        kit.startAndWait();

        // We want to know when we receive money.
        kit.wallet().addEventListener(new Listener(filePrefix));

        Address sendToAddress = kit.wallet().getKeys().get(0).toAddress(params);
        System.out.println("Send coins to: " + sendToAddress);
    }

	public void sendCoins(String address, String value) {
        File file = new File("D:/tools/Bitcoin/bitcoinj/" + filePrefix + ".wallet");
        Wallet wallet = kit.wallet(); 
        
		try {
			// Get the address 1RbxbA1yP2Lebauuef3cBiBho853f7jxs in object form.
			Address targetAddress = new Address(kit.params(), address);
			// Do the send of the coins in the background. This could throw InsufficientMoneyException.
			Wallet.SendResult result = wallet.sendCoins(kit.peerGroup(), targetAddress, Utils.toNanoCoins(value));
			// Save the wallet to disk, optional if using auto saving (see below).
			wallet.saveToFile(file);
			// Wait for the transaction to propagate across the P2P network, indicating acceptance.
			result.broadcastComplete.get();
			
			System.out.println("SendCoins.main(tx)" + result.tx);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public void stop() {
        kit.stop();
    }
}
