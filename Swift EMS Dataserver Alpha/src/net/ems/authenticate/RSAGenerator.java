package net.ems.authenticate;

import java.security.*;


public class RSAGenerator {
	
	byte[] rsaPublicKey, rsaPrivateKey1, rsaPrivateKey2;

	public void generate() throws NoSuchAlgorithmException,NoSuchProviderException{
		
		
		
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		kpg.initialize(2048);
		
		byte [] genPublicKey = kpg.genKeyPair().getPublic().getEncoded();
		rsaPublicKey = genPublicKey;
	}
	public byte[] getPublicKey(){
		return rsaPublicKey;
	}
}
