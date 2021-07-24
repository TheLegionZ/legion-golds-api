package io.github.sasuked.legiongolds;

import io.github.sasuked.legiongolds.transaction.GoldTransactionContext;
import io.github.sasuked.legiongolds.transaction.GoldTransactionType;

import static io.github.sasuked.legiongolds.transaction.GoldTransactionContext.create;

public interface LegionGoldsService {

	double getBalance(String playerName);

	boolean deposit(String playerName, double valueToDeposit, GoldTransactionContext context);

	default boolean depositFromCommand(String playerName, double valueToDeposit, String commandSender) {
		return deposit(playerName, valueToDeposit, create(playerName, valueToDeposit, GoldTransactionType.RECEIVED_BY_COMMAND)
			.commandSender(commandSender));
	}

	boolean withdraw(String playerName, double valueToWithdraw, GoldTransactionContext context);

	default boolean withdrawFromCommand(String playerName, double valueToWithdraw, String commandSender) {
		return withdraw(playerName, valueToWithdraw, create(playerName, valueToWithdraw, GoldTransactionType.WITHDRAW_BY_COMMAND)
			.commandSender(commandSender));
	}

	boolean set(String playerName, double valueToSet, GoldTransactionContext context);

	default boolean setFromCommand(String playerName, double valueToSet, String commandSender) {
		return set(playerName, valueToSet, create(playerName, valueToSet, GoldTransactionType.SET_BY_COMMAND)
			.commandSender(commandSender));
	}

	default boolean setFromCustomReason(String playerName, double valueToSet, String customDescription) {
		GoldTransactionContext context = create(playerName, valueToSet, GoldTransactionType.CUSTOM)
			.customDescription(customDescription);

		return set(playerName, valueToSet, context);
	}
}
