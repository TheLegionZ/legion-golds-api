package io.github.sasuked.legiongolds.transaction;

import lombok.Getter;

@Getter
public class GoldTransactionContext {

	private String playerName;
	private GoldTransactionType transactionType;
	private double transactionAmount;
	private String commandSender;
	private String customDescription;

	public static GoldTransactionContext create(String playerName, double transactionAmount, GoldTransactionType type) {
		return new GoldTransactionContext(playerName, transactionAmount, type);
	}

	public GoldTransactionContext(String playerName, double transactionAmount, GoldTransactionType type) {
		this.playerName = playerName;
		this.transactionAmount = transactionAmount;
		this.transactionType = type;
	}

	public GoldTransactionContext playerName(String playerName) {
		this.playerName = playerName;
		return this;
	}


	public GoldTransactionContext transactionType(GoldTransactionType transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public GoldTransactionContext commandSender(String commandSender) {
		this.commandSender = commandSender;
		return this;
	}

	public GoldTransactionContext transactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public GoldTransactionContext customDescription(String customDescription) {
		this.customDescription = customDescription;
		return this;
	}
}
