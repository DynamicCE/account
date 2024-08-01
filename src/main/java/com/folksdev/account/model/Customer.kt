package com.folksdev.account.model

import jakarta.persistence.*

@Entity
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String?,

            val name: String?,
                    val surname String?

                            @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
                            val account: Set<Account>?

}