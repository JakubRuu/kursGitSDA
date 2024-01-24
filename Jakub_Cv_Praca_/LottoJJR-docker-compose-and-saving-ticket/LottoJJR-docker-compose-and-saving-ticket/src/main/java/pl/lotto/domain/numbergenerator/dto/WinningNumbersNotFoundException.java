package pl.lotto.domain.numbergenerator.dto;


public class WinningNumbersNotFoundException extends RuntimeException {

    WinningNumbersNotFoundException(String message) {
        super(message);
    }
}