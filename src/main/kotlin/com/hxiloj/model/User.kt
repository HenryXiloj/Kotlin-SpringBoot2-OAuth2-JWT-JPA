package com.hxiloj.model

import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


/**
 * The persistent class for the users database table.
 *
 */
@Entity
@Table(name = "users")
class User : Serializable {
        @Id
        var id = 0
        var username: String? = null
        var password: String? = null
        var created: Timestamp? = null

}