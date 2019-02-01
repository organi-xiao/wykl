package itcat.koala.entity;
/**
 * 用户
 */

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private Integer id;          //用户表id
    private String username;    //用户名
    private String password;  //用户密码，MD5加密
    private String email;
    private String phone;      //手机号码
    private String question;    //找回密码问题
    private String answer;      //找回密码答案
    private Integer role;        //角色0-管理员,1-普通用户
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_time; //创建时间
    private String create_timeStr;

    public String getCreate_timeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (create_time!=null){
            create_timeStr = sdf.format(create_time);
        }
        return create_timeStr;
    }

    public void setCreate_timeStr(String create_timeStr) {
        this.create_timeStr = create_timeStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", role=" + role +
                ", create_time=" + create_time +
                '}';
    }
}
