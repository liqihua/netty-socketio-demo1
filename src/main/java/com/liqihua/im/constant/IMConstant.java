package com.liqihua.im.constant;

/**
 * @author liqihua
 * @since 2018/6/1
 */
public class IMConstant {

    public enum NameSpace{

        IM("/im");

        private String namespace;

        NameSpace(String namespace) {
            this.namespace = namespace;
        }

        public String getNamespace() {
            return namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }
    }

}
