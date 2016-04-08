package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Member implements Serializable {
    

    
  private static int nextID;
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int age;
  private String eyeColor;
  private String name;
  private String gender;
  private String email;
  private List<Member> friends = new ArrayList();

    public Member() {
    }

  public Member(int age, String eyeColor, String name, String gender, String email) {
    this.id = ++nextID;
    this.age = age;
    this.eyeColor = eyeColor;
    this.name = name;
    this.gender = gender;
    this.email = email;
  }
 
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Member> getFriends() {
    return friends;
  }

 public void addFriend(Member friend){
   friends.add(friend);
 }
  
}
