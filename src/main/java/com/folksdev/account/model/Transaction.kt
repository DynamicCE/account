package com.folksdev.account.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
data class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String?,
    val transactionType:TransactionType? = TransactionType.INITIAL,
            val amount:BigDecimal?,
                    val transactionDate: LocalDateTime?,
                            @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
                            @JoinColumn(name="account_id", nullable = false)
                            val account :Account

}{

}

enum class TransactionType{
    INITIAL,TRANSFER
}