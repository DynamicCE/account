package com.folksdev.account.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime


@Entity
class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String?,
    val balance: BigDecimal? = BigDecimal.ZERO
    val creationDate : LocalDateTime,

            @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
            @JoinColumn(name = "customer_id", nullable = false)
            val customer:Customer?,

          @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
          val transaction: Set<Transaction>?
}{

}