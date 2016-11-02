package com.struts2.model;

/**
 * author ye
 * email: dachmx@163.com
 * date 2015年10月9日
 * time 下午8:34:38
 */

public class CodeStore implements java.io.Serializable {

    // Fields

    private Integer id;
    private Integer category;
    private String name;
    private String codetext;
    private String describe;

    // Constructors

    /** default constructor */
    public CodeStore() {
    }

    /** minimal constructor */
    public CodeStore(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public CodeStore(Integer id, Integer category, String name,
            String codetext, String describe) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.codetext = codetext;
        this.describe = describe;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodetext() {
        return this.codetext;
    }

    public void setCodetext(String codetext) {
        this.codetext = codetext;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
