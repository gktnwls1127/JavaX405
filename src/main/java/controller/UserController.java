package controller;

import model.UserDTO;

import java.util.ArrayList;

public class UserController {
    private ArrayList<UserDTO> list;
    // ArrayLis<제네릭> : ArrayList 가 어떤것을 모아두었는지 적는 것
    private int nextId;
    public UserController(){
        list = new ArrayList<>();
        nextId = 1;
    }

    // CRUD
    public void insert(UserDTO userDTO){
        userDTO.setId(nextId++);
        list.add(userDTO);
    }

    public UserDTO selectById(int id){
        for (UserDTO u : list){
            if (u.getId() == id){
                return new UserDTO(u);
            }
        }

        return null;
    }

    public void update(UserDTO userDTO){
        list.set(list.indexOf(userDTO), userDTO);
    }

    public void delete(int id){
        UserDTO u = new UserDTO();
        u.setId(id);
        list.remove(u);
    }

    public boolean validateUsername(String username){
        if (username.equalsIgnoreCase("X")){
            return false;
        }
        for(UserDTO u : list){
            if(username.equalsIgnoreCase(u.getUsername())){
                return false;
            }
        }

        return true;
    }

    public UserDTO auth(String username, String password){
        for (UserDTO u : list){
            if (username.equalsIgnoreCase(u.getUsername()) && password.equals(u.getPassword())){
                return new UserDTO(u);
            }
        }

        return null;
    }

}
