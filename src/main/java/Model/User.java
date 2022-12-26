package Model;

import Utils.DateUtil;

import java.time.Instant;
import java.util.Date;

public class User {
    private long ID;
    private String account;
    private String password;
    private String fullname;
    private String mobile;
    private String email;
    private Role role;
    private Date createdDate;
    private String address;

    public User() {
    }

    public User(long ID, String account, String password, String fullname, String mobile, String email, String address, Role role) {
        this.ID = ID;
        this.account = account;
        this.password = password;
        this.fullname = fullname;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.role = role;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10s %10s %10s %10s", this.ID,
                this.account, this.password, this.fullname, this.mobile, this.email, this.address, this.role);
    }

    public String toData() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", this.getID(), this.getAccount(), this.getPassword(),
                this.getFullname(), this.getMobile(), this.getEmail(), this.getAddress(), String.valueOf(this.getRole())
                , DateUtil.convertDateToString(this.createdDate));
    }

//    public static User parseUser(String raw) {
//        User user = new User();
//        String[] fields = raw.split(",");
//        user.id = Long.parseLong(fields[0]);
//        user.username = fields[1];
//        user.password = fields[2];
//        user.fullName = fields[3];
//        user.mobile = fields[4];
//        user.email = fields[5];
//        user.address = fields[6];
//        user.role = Role.parseRole(fields[7]);
//        user.createdAt = Instant.parse(fields[8]);
//        String temp = fields[9];
//        if(temp != null && !temp.equals("null"))
//            user.updatedAt = Instant.parse(temp);
//        return user;
//    }
}
