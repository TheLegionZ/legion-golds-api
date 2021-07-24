package io.github.sasuked.legiongolds.transaction;

import java.util.Map;
import java.util.WeakHashMap;

public class GoldTransactionContext {

	private Map<String, Object> context;

	public GoldTransactionContext(Map<String, Object> context) {
		this.context = context;
	}

	public GoldTransactionContext playerName(String playerName) {
		return put("playerName", playerName);
	}

	public GoldTransactionContext cashAmountAtMoment(double cashAmountAtMoment) {
		return put("cashAmountAtMoment", cashAmountAtMoment);
	}

	public GoldTransactionContext transactionTime(long transactionTime) {
		return put("transactionTime", transactionTime);
	}

	public GoldTransactionContext transactionType(GoldTransactionType type) {
		return put("transactionType", type.ordinal());
	}

	public GoldTransactionContext receivedAmount(double receivedAmount) {
		return put("receivedAmount", receivedAmount);
	}

	public GoldTransactionContext commandSenderName(String commandSenderName) {
		return put("commandSenderName", commandSenderName);
	}

	public GoldTransactionContext amountSet(double amountSet) {
		return put("amountSet", amountSet);
	}

	public GoldTransactionContext withdrawAmount(double withdrawAmount) {
		return put("withdrawAmount", withdrawAmount);
	}

	public GoldTransactionContext customDescription(String customDescription) {
		return put("customDescription", customDescription);
	}

	private GoldTransactionContext put(String key, Object value) {
		context.put(key, value);
		return this;
	}

	public GoldTransactionContext() {
		this(new WeakHashMap<>());
	}

	public Map<String, Object> build() {
		return context;
	}
}
