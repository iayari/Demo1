package tn.cni.dp.demo1.services;

import javax.ejb.Remote;

import tn.cni.dp.demo1.entities.User;
import tn.cni.dp.demo1.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
