package com.demoone.dh.entity.po;

import java.io.Serializable;

/**
 * 
 *
 * @author dh
 * @date 2019/10/09
 */
public class AUser implements Serializable{
    /**
     * 
     */
    private Integer userid;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String userpic;

    /**
     * 
     * @return UserId 
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 
     * @param userid 
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 
     * @return UserName 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 
     * @return USerPic 
     */
    public String getUserpic() {
        return userpic;
    }

    /**
     * 
     * @param userpic 
     */
    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }
}