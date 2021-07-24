package io.github.sasuked.legiongolds.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum GoldTransactionType {

	INVALID_TYPE("Não identificado"),
	RECEIVED_BY_COMMAND("Recebimento por comando"),
	SET_BY_COMMAND("Quantidade setada por comando"),
	SHOP_PRODUCT_PAYMENT("Compra de produto na loja"),
	WITHDRAW_BY_COMMAND("Retirada por comando"),
	CUSTOM("Customizado");


	public static GoldTransactionType fromOrdinal(int ordinalId) {
		for (GoldTransactionType it : values()) {
			if (ordinalId == it.ordinal()) {
				return it;
			}
		}
		return null;
	}

	private final String name;
}