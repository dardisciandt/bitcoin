package com.bitcoin.web;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.Transaction;
import com.google.bitcoin.core.Utils;
import com.google.bitcoin.core.Wallet;
import com.google.bitcoin.core.WalletEventListener;
import com.google.bitcoin.script.Script;

public class Listener implements WalletEventListener {

	private String filePrefix;
	
	public Listener(String filePrefix){
		this.filePrefix = filePrefix;
	}
	
    public void onCoinsReceived(Wallet w, Transaction tx, BigInteger prevBalance, BigInteger newBalance) {
    	System.out.println("Listener.onCoinsReceived()");
    	BigInteger value = tx.getValueSentToMe(w);
        System.out.println("Received tx for " + Utils.bitcoinValueToFriendlyString(value) + ": " + tx);
        System.out.println("Transaction will be forwarded after it confirms.");
        
        try {
        	
			w.saveToFile(new File("D:/tools/Bitcoin/bitcoinj/" + filePrefix + ".wallet"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	public void onCoinsSent(Wallet wallet, Transaction tx,
			BigInteger prevBalance, BigInteger newBalance) {

		System.out.println("Listener.onCoinsSent()");
	}

	public void onReorganize(Wallet wallet) {

		System.out.println("Listener.onReorganize()");
	}

	public void onTransactionConfidenceChanged(Wallet wallet, Transaction tx) {

		System.out.println("Listener.onTransactionConfidenceChanged()");
	}

	public void onWalletChanged(Wallet wallet) {

		System.out.println("Listener.onWalletChanged()");
	}

	public void onKeysAdded(Wallet wallet, List<ECKey> keys) {

		System.out.println("Listener.onKeysAdded()");
	}

	public void onScriptsAdded(Wallet wallet, List<Script> scripts) {

		System.out.println("Listener.onScriptsAdded()");
	}

}
