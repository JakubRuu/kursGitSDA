package pl.lotto.domain.numbergenerator.dto;

public interface OneRandomNumberFetcher {
    OneRandomNumberResponseDto retrieveOneRandomNumber(int lowerBand, int upperBand);
}