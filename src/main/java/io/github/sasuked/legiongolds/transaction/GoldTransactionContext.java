package io.github.sasuked.legiongolds.transaction;

import lombok.Getter;

@Getter
public class GoldTransactionContext {

	private String playerName;
	private Double cashAmountAtMoment;
	private Long transactionTime;
	private GoldTransactionType transactionType;
	private Double receivedAmount;
	private Double amountSet;
	private Double withdrawAmount;
	private String commandSenderName;
	private String customDescription;

	public GoldTransactionContext playerName(String playerName) {
		this.playerName = playerName;
		return this;
	}

	public GoldTransactionContext cashAmountAtMoment(double cashAmountAtMoment) {
		this.cashAmountAtMoment = cashAmountAtMoment;
		return this;
	}

	public GoldTransactionContext transactionTime(long transactionTime) {
		this.transactionTime = transactionTime;
		return this;
	}

	public GoldTransactionContext transactionType(GoldTransactionType transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public GoldTransactionContext receivedAmount(double receivedAmount) {
		this.receivedAmount = receivedAmount;
		return this;
	}

	public GoldTransactionContext commandSenderName(String commandSenderName) {
		this.commandSenderName = commandSenderName;
		return this;
	}

	public GoldTransactionContext amountSet(double amountSet) {
		this.amountSet = amountSet;
		return this;
	}

	public GoldTransactionContext withdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		return this;
	}

	public GoldTransactionContext customDescription(String customDescription) {
		this.customDescription = customDescription;
		return this;
	}
}
