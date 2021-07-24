package io.github.sasuked.legiongolds;

import io.github.sasuked.legiongolds.ranking.GoldRankingEntry;

import java.util.List;
import java.util.Map;

public interface LegionGoldsService {

	double getBalance(String playerName);

	boolean deposit(String playerName, double valueToDeposit, Map<String, Object> context);

	boolean withdraw(String playerName, double valueToWithdraw, Map<String, Object> context);

	boolean set(String playerName, double valueToSet, Map<String, Object> context);

	List<GoldRankingEntry> getGoldRankingEntryList();
}
