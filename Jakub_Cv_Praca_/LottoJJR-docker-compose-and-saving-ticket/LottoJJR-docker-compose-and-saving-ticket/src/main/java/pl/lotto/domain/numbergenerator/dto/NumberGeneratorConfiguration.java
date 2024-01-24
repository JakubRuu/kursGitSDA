package pl.lotto.domain.numbergenerator.dto;


import org.springframework.context.annotation.Configuration;
import pl.lotto.domain.numberreceiver.NumberReceiverFacade;


@Configuration
public class NumberGeneratorConfiguration {

    WinningNumbersGeneratorFacade createForTest(RandomNumberGenerable generator, WinningNumbersRepository winningNumbersRepository, NumberReceiverFacade numberReceiverFacade) {
        WinningNumberValidator winningNumberValidator = new WinningNumberValidator();
        return new WinningNumbersGeneratorFacade(generator, winningNumberValidator, winningNumbersRepository, numberReceiverFacade);
    }
}