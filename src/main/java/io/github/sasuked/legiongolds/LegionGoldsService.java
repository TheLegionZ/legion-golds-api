package io.github.sasuked.legiongolds;

import io.github.sasuked.legiongolds.ranking.GoldRankingEntry;
import io.github.sasuked.legiongolds.transaction.GoldTransactionContext;

import java.util.List;

public interface LegionGoldsService {

	double getBalance(String playerName);

	boolean deposit(String playerName, double valueToDeposit, GoldTransactionContext context);

	boolean withdraw(String playerName, double valueToWithdraw, GoldTransactionContext context);

	boolean set(String playerName, double valueToSet, GoldTransactionContext context);

	List<GoldRankingEntry> getGoldRankingEntryList();
}
