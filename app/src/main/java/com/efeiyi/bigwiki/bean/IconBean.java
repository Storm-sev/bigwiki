package com.efeiyi.bigwiki.bean;

import java.util.List;

/**
 * 图片相关的bean类
 */
public class IconBean {
    /**
     * msg : SUCCESS
     * total : 5
     * code : 0
     * data : [{"dataStatus":"\u0000","id":"1","lastEditTime":"2018-05-10 00:00:00","name":"首页","resource_OFF":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"resource_ON":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"sequence":"1","status":"0","type":"0","url":"www.baidu.com"},{"dataStatus":"\u0000","id":"6","lastEditTime":null,"name":"资讯","resource_OFF":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"resource_ON":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"sequence":"2","status":"0","type":"0","url":"www.baidu.com"},{"dataStatus":"\u0000","id":"7","lastEditTime":null,"name":"百科","resource_OFF":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"resource_ON":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"sequence":"3","status":"0","type":"0","url":"www.diich.com"},{"dataStatus":"\u0000","id":"8","lastEditTime":null,"name":"活动","resource_OFF":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"resource_ON":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"sequence":"4","status":"0","type":"0","url":"www.baidu.com"},{"dataStatus":"\u0000","id":"9","lastEditTime":null,"name":"活化馆","resource_OFF":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"resource_ON":{"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"},"sequence":"5","status":"0","type":"0","url":"www."}]
     */

    private String msg;
    private int total;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * dataStatus :  
         * id : 1
         * lastEditTime : 2018-05-10 00:00:00
         * name : 首页
         * resource_OFF : {"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"}
         * resource_ON : {"dataStatus":"\u0000","description":"","id":"1358513758","resOrder":null,"status":"0","thumbnailUri":"","type":null,"uri":"NAVBAR.zip"}
         * sequence : 1
         * status : 0
         * type : 0
         * url : www.baidu.com
         */

        private String dataStatus;
        private String id;
        private String lastEditTime;
        private String name;
        private ResourceOFFBean resource_OFF;
        private ResourceONBean resource_ON;
        private String sequence;
        private String status;
        private String type;
        private String url;

        public String getDataStatus() {
            return dataStatus;
        }

        public void setDataStatus(String dataStatus) {
            this.dataStatus = dataStatus;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLastEditTime() {
            return lastEditTime;
        }

        public void setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ResourceOFFBean getResource_OFF() {
            return resource_OFF;
        }

        public void setResource_OFF(ResourceOFFBean resource_OFF) {
            this.resource_OFF = resource_OFF;
        }

        public ResourceONBean getResource_ON() {
            return resource_ON;
        }

        public void setResource_ON(ResourceONBean resource_ON) {
            this.resource_ON = resource_ON;
        }

        public String getSequence() {
            return sequence;
        }

        public void setSequence(String sequence) {
            this.sequence = sequence;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public static class ResourceOFFBean {
            /**
             * dataStatus :  
             * description :
             * id : 1358513758
             * resOrder : null
             * status : 0
             * thumbnailUri :
             * type : null
             * uri : NAVBAR.zip
             */

            private String dataStatus;
            private String description;
            private String id;
            private Object resOrder;
            private String status;
            private String thumbnailUri;
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

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getThumbnailUri() {
                return thumbnailUri;
            }

            public void setThumbnailUri(String thumbnailUri) {
                this.thumbnailUri = thumbnailUri;
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

        public static class ResourceONBean {
            /**
             * dataStatus :  
             * description :
             * id : 1358513758
             * resOrder : null
             * status : 0
             * thumbnailUri :
             * type : null
             * uri : NAVBAR.zip
             */

            private String dataStatus;
            private String description;
            private String id;
            private Object resOrder;
            private String status;
            private String thumbnailUri;
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

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getThumbnailUri() {
                return thumbnailUri;
            }

            public void setThumbnailUri(String thumbnailUri) {
                this.thumbnailUri = thumbnailUri;
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


//    boolean isNewIcon;   // 是否有新的图标
//    boolean isNowUse;       // 是否现在使用
//
//
//    String fileName;  // 未选中时 图片的名字
//
//    long contentLength;  // 未选中时候图片的长度
//
//
//    String iconUrl;  // 未选中时 图片的链接
//
//    public boolean isNewIcon() {
//        return isNewIcon;
//    }
//
//    public void setNewIcon(boolean newIcon) {
//        isNewIcon = newIcon;
//    }
//
//    public boolean isNowUse() {
//        return isNowUse;
//    }
//
//    public void setNowUse(boolean nowUse) {
//        isNowUse = nowUse;
//    }
//
//    public String getFileSelectName() {
//        return fileSelectName;
//    }
//
//    public void setFileSelectName(String fileSelectName) {
//        this.fileSelectName = fileSelectName;
//    }
//
//    public long getContentSelectLength() {
//        return contentSelectLength;
//    }
//
//    public void setContentSelectLength(long contentSelectLength) {
//        this.contentSelectLength = contentSelectLength;
//    }
//
//    public String getIconSelectUrl() {
//        return iconSelectUrl;
//    }
//
//    public void setIconSelectUrl(String iconSelectUrl) {
//        this.iconSelectUrl = iconSelectUrl;
//    }
//
//    String fileSelectName;  // 选中时候图片的名字
//
//    long contentSelectLength;  // 选中时图片的
//
//    String iconSelectUrl; //
//
//    public String getIconUrl() {
//        return iconUrl;
//    }
//
//    public void setIconUrl(String iconUrl) {
//        this.iconUrl = iconUrl;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public long getContentLength() {
//        return contentLength;
//    }
//
//    public void setContentLength(long contentLength) {
//        this.contentLength = contentLength;
//    }
//
//    @Override
//    public String toString() {
//        return "IconBean{" +
//                "fileName='" + fileName + '\'' +
//                ", contentLength=" + contentLength +
//                '}';
//    }
}
