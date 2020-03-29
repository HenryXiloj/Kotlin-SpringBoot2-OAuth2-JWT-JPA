package com.hxiloj.service.impl

import com.hxiloj.model.User
import com.hxiloj.repository.UserRepository
import com.hxiloj.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service



@Service(value = "userService")
class UserServiceImpl : UserDetailsService, UserService {
	@Autowired
	lateinit var userRepository: UserRepository

	@Throws(UsernameNotFoundException::class)
	override fun loadUserByUsername(userId: String): UserDetails {
		val user: User = userRepository?.findByUsername(userId)
				?: throw UsernameNotFoundException("Invalid username or password.")
		return org.springframework.security.core.userdetails.User(user.username, user.password, authority)
	}

	private val authority: List<SimpleGrantedAuthority>
		private get() = listOf(SimpleGrantedAuthority("ROLE_ADMIN"))

	override fun getAllUsers(): MutableList<User> {
		return userRepository.findAll()
	}


}




