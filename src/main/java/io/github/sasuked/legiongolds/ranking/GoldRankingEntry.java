package io.github.sasuked.legiongolds.ranking;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
public class GoldRankingEntry {

	private final String userName;
	private final double goldAmount;

}
