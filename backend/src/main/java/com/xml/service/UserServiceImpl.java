package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.repository.UserRepository;
import com.xml.user.User;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findOne(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User activateDeactivate(User korisnik) throws Exception {
		User korisnikUpdt = this.userRepository.findById(korisnik.getId()).get();

        if(korisnikUpdt == null){
            throw new Exception("Nije pronadjen korisnik.");
        }


        if(korisnikUpdt.isAktivan() == true) {
            korisnikUpdt.setAktivan(false);
        }else if(korisnikUpdt.isAktivan() == false){
            korisnikUpdt.setAktivan(true);
        }


        User updateKorisnik = this.userRepository.save(korisnikUpdt);
        return updateKorisnik;
	}

}
