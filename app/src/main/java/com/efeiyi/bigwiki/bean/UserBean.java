package com.efeiyi.bigwiki.bean;

public class UserBean {


    /**
     * msg : SUCCESS
     * code : 0
     * data : {"credit":null,"dataStatus":"\u0000","gender":null,"headPortrait":{"dataStatus":"\u0000","description":"","id":"996334316207206401","resOrder":null,"status":null,"thumbnailId":null,"type":null,"uri":""},"id":"996334316207206400","lastLoginDate":"2018-05-16 10:24:00","lastLoginIp":"61.148.188.194","loginName":"fyX6Pgfvvi","loginType":null,"mail":"","name":"大百科用户8642","password":"","phone":"18235188642","qqUnionid":"","rank":null,"role":null,"status":"0","type":null,"wxUnionid":""}
     */

    private String msg;
    private int code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * credit : null
         * dataStatus :  
         * gender : null
         * headPortrait : {"dataStatus":"\u0000","description":"","id":"996334316207206401","resOrder":null,"status":null,"thumbnailId":null,"type":null,"uri":""}
         * id : 996334316207206400
         * lastLoginDate : 2018-05-16 10:24:00
         * lastLoginIp : 61.148.188.194
         * loginName : fyX6Pgfvvi
         * loginType : null
         * mail :
         * name : 大百科用户8642
         * password :
         * phone : 18235188642
         * qqUnionid :
         * rank : null
         * role : null
         * status : 0
         * type : null
         * wxUnionid :
         */

        private Object credit;
        private String dataStatus;
        private Object gender;
        private HeadPortraitBean headPortrait;
        private String id;
        private String lastLoginDate;
        private String lastLoginIp;
        private String loginName;
        private Object loginType;
        private String mail;
        private String name;
        private String password;
        private String phone;
        private String qqUnionid;
        private Object rank;
        private Object role;
        private String status;
        private Object type;
        private String wxUnionid;

        public Object getCredit() {
            return credit;
        }

        public void setCredit(Object credit) {
            this.credit = credit;
        }

        public String getDataStatus() {
            return dataStatus;
        }

        public void setDataStatus(String dataStatus) {
            this.dataStatus = dataStatus;
        }

        public Object getGender() {
            return gender;
        }

        public void setGender(Object gender) {
            this.gender = gender;
        }

        public HeadPortraitBean getHeadPortrait() {
            return headPortrait;
        }

        public void setHeadPortrait(HeadPortraitBean headPortrait) {
            this.headPortrait = headPortrait;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLastLoginDate() {
            return lastLoginDate;
        }

        public void setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
        }

        public String getLastLoginIp() {
            return lastLoginIp;
        }

        public void setLastLoginIp(String lastLoginIp) {
            this.lastLoginIp = lastLoginIp;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public Object getLoginType() {
            return loginType;
        }

        public void setLoginType(Object loginType) {
            this.loginType = loginType;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getQqUnionid() {
            return qqUnionid;
        }

        public void setQqUnionid(String qqUnionid) {
            this.qqUnionid = qqUnionid;
        }

        public Object getRank() {
            return rank;
        }

        public void setRank(Object rank) {
            this.rank = rank;
        }

        public Object getRole() {
            return role;
        }

        public void setRole(Object role) {
            this.role = role;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public String getWxUnionid() {
            return wxUnionid;
        }

        public void setWxUnionid(String wxUnionid) {
            this.wxUnionid = wxUnionid;
        }

        public static class HeadPortraitBean {
            /**
             * dataStatus :  
             * description :
             * id : 996334316207206401
             * resOrder : null
             * status : null
             * thumbnailId : null
             * type : null
             * uri :
             */

            private String dataStatus;
            private String description;
            private String id;
            private Object resOrder;
            private Object status;
            private Object thumbnailId;
            private Object type;
            private String uri;

            public String getDataStatus() {
                return dataStatus;
            }

            public void setDataStatus(String dataStatus) {
                this.dataStatus = dataStatus;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Object getResOrder() {
                return resOrder;
            }

            public void setResOrder(Object resOrder) {
                this.resOrder = resOrder;
            }

            public Object getStatus() {
                return status;
            }

            public void setStatus(Object status) {
                this.status = status;
            }

            public Object getThumbnailId() {
                return thumbnailId;
            }

            public void setThumbnailId(Object thumbnailId) {
                this.thumbnailId = thumbnailId;
            }

            public Object getType() {
                return type;
            }

            public void setType(Object type) {
                this.type = type;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }
        }
    }
}
