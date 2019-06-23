package pl.sdacademy.designpatterns.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AESsecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
       keyGenerator.init(new SecureRandom());
        return keyGenerator.generateKey();
    }
}
