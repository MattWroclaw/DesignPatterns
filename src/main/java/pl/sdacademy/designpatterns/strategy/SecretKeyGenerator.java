package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    public SecretKey create(final String alg) throws NoSuchAlgorithmException {
        switch (alg){
            case "aes":
                return new AESsecretKeyGenerationStrategy().generate();
            case "des":
                return new DESSecretKeyGenerationStrategy().generate();
        }
        throw new NoSuchAlgorithmException();
    }
}
