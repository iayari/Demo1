package tn.cni.dp.demo1.services;

import javax.ejb.Local;

import tn.cni.dp.demo1.entities.User;
import tn.cni.dp.demo1.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
