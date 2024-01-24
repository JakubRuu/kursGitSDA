package pl.lotto.domain.numbergenerator.dto;


import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
public record WinningNumbers(
        String id,
        Set<Integer> winningNumbers,
        LocalDateTime date) {
}