package com.wochunyi.wochunyi.data.entity.bean;

import java.util.List;

/**
 * @author wochunyi
 * @date 2019-06-02.
 * GitHub：https://github.com/13570524658
 */
public class SuserLogin {
        private int hangupOrders;
        private SuserBean suser;
        private int doingOrders;
        private List<?> messages;

        public int getHangupOrders() {
            return hangupOrders;
        }

        public void setHangupOrders(int hangupOrders) {
            this.hangupOrders = hangupOrders;
        }

        public SuserBean getSuser() {
            return suser;
        }

        public void setSuser(SuserBean suser) {
            this.suser = suser;
        }

        public int getDoingOrders() {
            return doingOrders;
        }

        public void setDoingOrders(int doingOrders) {
            this.doingOrders = doingOrders;
        }

        public List<?> getMessages() {
            return messages;
        }

        public void setMessages(List<?> messages) {
            this.messages = messages;
        }

        public static class SuserBean {
            /**
             * userStatus : 1
             * cilentid : 866774032811104
             * repairSkills : [{"utime":"2019-04-22 14:34:20","creater":"Admin","ctime":"2019-04-22 14:34:20","id":627,"brand":{"brandName":"Bosch高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":1,"status":1},"status":1}]
             * password : 123456
             * serviceStation : {"approvalStatus":1,"repairBrands":[{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"豪瀚","creater":"Admin","ctime":"2019-05-07 17:21:19","id":88,"brand":"重汽","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3984,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"斯太尔","creater":"Admin","ctime":"2019-05-07 17:21:19","id":92,"brand":"重汽","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3985,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-10 01:47:24","series":"卡罗拉","creater":"Admin","ctime":"2019-05-10 01:47:24","id":99,"brand":"丰田","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3983,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"华神","creater":"Admin","ctime":"2019-05-07 17:21:19","id":94,"brand":"东风","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3986,"status":1}],"utime":"2019-4-15 13:36:31","stationType":0,"stationAddresses":[{"trunkName":"是是","address":"中州市天河区","utime":"2019-05-23 10:46:29","creater":"Admin","ctime":"2019-05-23 10:46:29","id":714,"type":1,"status":1},{"trunkName":"1","address":"浙江省杭州市滨江区网商路669号","utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":700,"type":1,"status":1}],"repairSkills":[{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3784,"brand":{"brandName":"单体泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":6,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3782,"brand":{"utime":"2019-4-24 15:41:25","creater":"admin","typeName":"底盘","ctime":"2019-4-24 15:41:25","id":12,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3783,"brand":{"brandName":"手动变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":13,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3780,"brand":{"brandName":"其他电控柱塞分配泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":5,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3781,"brand":{"brandName":"AT变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":15,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3778,"brand":{"brandName":"DPF系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":10,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3779,"brand":{"brandName":"Bosch高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":1,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3776,"brand":{"brandName":"德尔福高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":2,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3777,"brand":{"brandName":"气助式SCR后处理系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":8,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3774,"brand":{"brandName":"泵喷嘴","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":7,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3775,"brand":{"brandName":"电控直列泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":4,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3772,"brand":{"brandName":"AMT手自一体变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":14,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3773,"brand":{"utime":"2019-4-24 15:41:25","creater":"admin","typeName":"整车电器","ctime":"2019-4-24 15:41:25","id":11,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3770,"brand":{"brandName":"电装高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":3,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3771,"brand":{"brandName":"非气助式电驱动SCR后处理系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":9,"status":1},"status":1}],"headImgUrl":"http://test-kxc.ruixiude.com:80/o2o/uploads/2019/04//6b534409-45c2-40bd-9437-5018dab2fcf3.jpg","phone":"13698567946","creater":"admin","ctime":"2019-4-15 13:36:31","stationName":"&华景新城服务站","id":3,"status":1}
             * repairFailTimes : 0
             * ctime : 2019-4-15 13:44:24
             * id : 10
             * repairSpeedRate : 0
             * qq : 0
             * repairBrands : []
             * repairTimes : 8
             * level : 1
             * utime : 2019-4-15 13:44:30
             * wechat :
             * loginStatus : 1
             * workTime : 0
             * repairQualityRate : 0
             * repairCancelTimes : 7
             * realName : 张辽
             * praiseRate : 0
             * phone : 18854140001
             * creater : admin
             * location : 113.362156,23.140983
             * status : 1
             */

            private int userStatus;
            private String cilentid;
            private String password;
            private ServiceStationBean serviceStation;
            private int repairFailTimes;
            private String ctime;
            private int id;
            private int repairSpeedRate;
            private int qq;
            private int repairTimes;
            private int level;
            private String utime;
            private String wechat;
            private int loginStatus;
            private int workTime;
            private int repairQualityRate;
            private int repairCancelTimes;
            private String realName;
            private int praiseRate;
            private long phone;
            private String creater;
            private String location;
            private int status;
            private List<RepairSkillsBeanX> repairSkills;
            private List<?> repairBrands;

            public int getUserStatus() {
                return userStatus;
            }

            public void setUserStatus(int userStatus) {
                this.userStatus = userStatus;
            }

            public String getCilentid() {
                return cilentid;
            }

            public void setCilentid(String cilentid) {
                this.cilentid = cilentid;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public ServiceStationBean getServiceStation() {
                return serviceStation;
            }

            public void setServiceStation(ServiceStationBean serviceStation) {
                this.serviceStation = serviceStation;
            }

            public int getRepairFailTimes() {
                return repairFailTimes;
            }

            public void setRepairFailTimes(int repairFailTimes) {
                this.repairFailTimes = repairFailTimes;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getRepairSpeedRate() {
                return repairSpeedRate;
            }

            public void setRepairSpeedRate(int repairSpeedRate) {
                this.repairSpeedRate = repairSpeedRate;
            }

            public int getQq() {
                return qq;
            }

            public void setQq(int qq) {
                this.qq = qq;
            }

            public int getRepairTimes() {
                return repairTimes;
            }

            public void setRepairTimes(int repairTimes) {
                this.repairTimes = repairTimes;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getUtime() {
                return utime;
            }

            public void setUtime(String utime) {
                this.utime = utime;
            }

            public String getWechat() {
                return wechat;
            }

            public void setWechat(String wechat) {
                this.wechat = wechat;
            }

            public int getLoginStatus() {
                return loginStatus;
            }

            public void setLoginStatus(int loginStatus) {
                this.loginStatus = loginStatus;
            }

            public int getWorkTime() {
                return workTime;
            }

            public void setWorkTime(int workTime) {
                this.workTime = workTime;
            }

            public int getRepairQualityRate() {
                return repairQualityRate;
            }

            public void setRepairQualityRate(int repairQualityRate) {
                this.repairQualityRate = repairQualityRate;
            }

            public int getRepairCancelTimes() {
                return repairCancelTimes;
            }

            public void setRepairCancelTimes(int repairCancelTimes) {
                this.repairCancelTimes = repairCancelTimes;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public int getPraiseRate() {
                return praiseRate;
            }

            public void setPraiseRate(int praiseRate) {
                this.praiseRate = praiseRate;
            }

            public long getPhone() {
                return phone;
            }

            public void setPhone(long phone) {
                this.phone = phone;
            }

            public String getCreater() {
                return creater;
            }

            public void setCreater(String creater) {
                this.creater = creater;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<RepairSkillsBeanX> getRepairSkills() {
                return repairSkills;
            }

            public void setRepairSkills(List<RepairSkillsBeanX> repairSkills) {
                this.repairSkills = repairSkills;
            }

            public List<?> getRepairBrands() {
                return repairBrands;
            }

            public void setRepairBrands(List<?> repairBrands) {
                this.repairBrands = repairBrands;
            }

            public static class ServiceStationBean {
                /**
                 * approvalStatus : 1
                 * repairBrands : [{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"豪瀚","creater":"Admin","ctime":"2019-05-07 17:21:19","id":88,"brand":"重汽","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3984,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"斯太尔","creater":"Admin","ctime":"2019-05-07 17:21:19","id":92,"brand":"重汽","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3985,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-10 01:47:24","series":"卡罗拉","creater":"Admin","ctime":"2019-05-10 01:47:24","id":99,"brand":"丰田","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3983,"status":1},{"vehicleBrand":{"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"华神","creater":"Admin","ctime":"2019-05-07 17:21:19","id":94,"brand":"东风","status":1},"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3986,"status":1}]
                 * utime : 2019-4-15 13:36:31
                 * stationType : 0
                 * stationAddresses : [{"trunkName":"是是","address":"中州市天河区","utime":"2019-05-23 10:46:29","creater":"Admin","ctime":"2019-05-23 10:46:29","id":714,"type":1,"status":1},{"trunkName":"1","address":"浙江省杭州市滨江区网商路669号","utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":700,"type":1,"status":1}]
                 * repairSkills : [{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3784,"brand":{"brandName":"单体泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":6,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3782,"brand":{"utime":"2019-4-24 15:41:25","creater":"admin","typeName":"底盘","ctime":"2019-4-24 15:41:25","id":12,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3783,"brand":{"brandName":"手动变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":13,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3780,"brand":{"brandName":"其他电控柱塞分配泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":5,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3781,"brand":{"brandName":"AT变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":15,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3778,"brand":{"brandName":"DPF系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":10,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3779,"brand":{"brandName":"Bosch高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":1,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3776,"brand":{"brandName":"德尔福高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":2,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3777,"brand":{"brandName":"气助式SCR后处理系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":8,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3774,"brand":{"brandName":"泵喷嘴","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":7,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3775,"brand":{"brandName":"电控直列泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":4,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3772,"brand":{"brandName":"AMT手自一体变速箱","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"变速箱","ctime":"2019-4-24 15:41:25","id":14,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3773,"brand":{"utime":"2019-4-24 15:41:25","creater":"admin","typeName":"整车电器","ctime":"2019-4-24 15:41:25","id":11,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3770,"brand":{"brandName":"电装高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":3,"status":1},"status":1},{"utime":"2019-05-22 16:20:01","creater":"Admin","ctime":"2019-05-22 16:20:01","id":3771,"brand":{"brandName":"非气助式电驱动SCR后处理系统","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"后处理","ctime":"2019-4-24 15:41:25","id":9,"status":1},"status":1}]
                 * headImgUrl : http://test-kxc.ruixiude.com:80/o2o/uploads/2019/04//6b534409-45c2-40bd-9437-5018dab2fcf3.jpg
                 * phone : 13698567946
                 * creater : admin
                 * ctime : 2019-4-15 13:36:31
                 * stationName : &华景新城服务站
                 * id : 3
                 * status : 1
                 */

                private int approvalStatus;
                private String utime;
                private int stationType;
                private String headImgUrl;
                private String phone;
                private String creater;
                private String ctime;
                private String stationName;
                private int id;
                private int status;
                private List<RepairBrandsBean> repairBrands;
                private List<StationAddressesBean> stationAddresses;
                private List<RepairSkillsBean> repairSkills;

                public int getApprovalStatus() {
                    return approvalStatus;
                }

                public void setApprovalStatus(int approvalStatus) {
                    this.approvalStatus = approvalStatus;
                }

                public String getUtime() {
                    return utime;
                }

                public void setUtime(String utime) {
                    this.utime = utime;
                }

                public int getStationType() {
                    return stationType;
                }

                public void setStationType(int stationType) {
                    this.stationType = stationType;
                }

                public String getHeadImgUrl() {
                    return headImgUrl;
                }

                public void setHeadImgUrl(String headImgUrl) {
                    this.headImgUrl = headImgUrl;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getCreater() {
                    return creater;
                }

                public void setCreater(String creater) {
                    this.creater = creater;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public String getStationName() {
                    return stationName;
                }

                public void setStationName(String stationName) {
                    this.stationName = stationName;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public List<RepairBrandsBean> getRepairBrands() {
                    return repairBrands;
                }

                public void setRepairBrands(List<RepairBrandsBean> repairBrands) {
                    this.repairBrands = repairBrands;
                }

                public List<StationAddressesBean> getStationAddresses() {
                    return stationAddresses;
                }

                public void setStationAddresses(List<StationAddressesBean> stationAddresses) {
                    this.stationAddresses = stationAddresses;
                }

                public List<RepairSkillsBean> getRepairSkills() {
                    return repairSkills;
                }

                public void setRepairSkills(List<RepairSkillsBean> repairSkills) {
                    this.repairSkills = repairSkills;
                }

                public static class RepairBrandsBean {
                    /**
                     * vehicleBrand : {"approvalStatus":1,"utime":"2019-05-07 17:21:24","series":"豪瀚","creater":"Admin","ctime":"2019-05-07 17:21:19","id":88,"brand":"重汽","status":1}
                     * utime : 2019-05-22 16:20:01
                     * creater : Admin
                     * ctime : 2019-05-22 16:20:01
                     * id : 3984
                     * status : 1
                     */

                    private VehicleBrandBean vehicleBrand;
                    private String utime;
                    private String creater;
                    private String ctime;
                    private int id;
                    private int status;

                    public VehicleBrandBean getVehicleBrand() {
                        return vehicleBrand;
                    }

                    public void setVehicleBrand(VehicleBrandBean vehicleBrand) {
                        this.vehicleBrand = vehicleBrand;
                    }

                    public String getUtime() {
                        return utime;
                    }

                    public void setUtime(String utime) {
                        this.utime = utime;
                    }

                    public String getCreater() {
                        return creater;
                    }

                    public void setCreater(String creater) {
                        this.creater = creater;
                    }

                    public String getCtime() {
                        return ctime;
                    }

                    public void setCtime(String ctime) {
                        this.ctime = ctime;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public static class VehicleBrandBean {
                        /**
                         * approvalStatus : 1
                         * utime : 2019-05-07 17:21:24
                         * series : 豪瀚
                         * creater : Admin
                         * ctime : 2019-05-07 17:21:19
                         * id : 88
                         * brand : 重汽
                         * status : 1
                         */

                        private int approvalStatus;
                        private String utime;
                        private String series;
                        private String creater;
                        private String ctime;
                        private int id;
                        private String brand;
                        private int status;

                        public int getApprovalStatus() {
                            return approvalStatus;
                        }

                        public void setApprovalStatus(int approvalStatus) {
                            this.approvalStatus = approvalStatus;
                        }

                        public String getUtime() {
                            return utime;
                        }

                        public void setUtime(String utime) {
                            this.utime = utime;
                        }

                        public String getSeries() {
                            return series;
                        }

                        public void setSeries(String series) {
                            this.series = series;
                        }

                        public String getCreater() {
                            return creater;
                        }

                        public void setCreater(String creater) {
                            this.creater = creater;
                        }

                        public String getCtime() {
                            return ctime;
                        }

                        public void setCtime(String ctime) {
                            this.ctime = ctime;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getBrand() {
                            return brand;
                        }

                        public void setBrand(String brand) {
                            this.brand = brand;
                        }

                        public int getStatus() {
                            return status;
                        }

                        public void setStatus(int status) {
                            this.status = status;
                        }
                    }
                }

                public static class StationAddressesBean {
                    /**
                     * trunkName : 是是
                     * address : 中州市天河区
                     * utime : 2019-05-23 10:46:29
                     * creater : Admin
                     * ctime : 2019-05-23 10:46:29
                     * id : 714
                     * type : 1
                     * status : 1
                     */

                    private String trunkName;
                    private String address;
                    private String utime;
                    private String creater;
                    private String ctime;
                    private int id;
                    private int type;
                    private int status;

                    public String getTrunkName() {
                        return trunkName;
                    }

                    public void setTrunkName(String trunkName) {
                        this.trunkName = trunkName;
                    }

                    public String getAddress() {
                        return address;
                    }

                    public void setAddress(String address) {
                        this.address = address;
                    }

                    public String getUtime() {
                        return utime;
                    }

                    public void setUtime(String utime) {
                        this.utime = utime;
                    }

                    public String getCreater() {
                        return creater;
                    }

                    public void setCreater(String creater) {
                        this.creater = creater;
                    }

                    public String getCtime() {
                        return ctime;
                    }

                    public void setCtime(String ctime) {
                        this.ctime = ctime;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }
                }

                public static class RepairSkillsBean {
                    /**
                     * utime : 2019-05-22 16:20:01
                     * creater : Admin
                     * ctime : 2019-05-22 16:20:01
                     * id : 3784
                     * brand : {"brandName":"单体泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":6,"status":1}
                     * status : 1
                     */

                    private String utime;
                    private String creater;
                    private String ctime;
                    private int id;
                    private BrandBean brand;
                    private int status;

                    public String getUtime() {
                        return utime;
                    }

                    public void setUtime(String utime) {
                        this.utime = utime;
                    }

                    public String getCreater() {
                        return creater;
                    }

                    public void setCreater(String creater) {
                        this.creater = creater;
                    }

                    public String getCtime() {
                        return ctime;
                    }

                    public void setCtime(String ctime) {
                        this.ctime = ctime;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public BrandBean getBrand() {
                        return brand;
                    }

                    public void setBrand(BrandBean brand) {
                        this.brand = brand;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public static class BrandBean {
                        /**
                         * brandName : 单体泵
                         * utime : 2019-4-24 15:41:25
                         * creater : admin
                         * typeName : 发动机
                         * ctime : 2019-4-24 15:41:25
                         * id : 6
                         * status : 1
                         */

                        private String brandName;
                        private String utime;
                        private String creater;
                        private String typeName;
                        private String ctime;
                        private int id;
                        private int status;

                        public String getBrandName() {
                            return brandName;
                        }

                        public void setBrandName(String brandName) {
                            this.brandName = brandName;
                        }

                        public String getUtime() {
                            return utime;
                        }

                        public void setUtime(String utime) {
                            this.utime = utime;
                        }

                        public String getCreater() {
                            return creater;
                        }

                        public void setCreater(String creater) {
                            this.creater = creater;
                        }

                        public String getTypeName() {
                            return typeName;
                        }

                        public void setTypeName(String typeName) {
                            this.typeName = typeName;
                        }

                        public String getCtime() {
                            return ctime;
                        }

                        public void setCtime(String ctime) {
                            this.ctime = ctime;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public int getStatus() {
                            return status;
                        }

                        public void setStatus(int status) {
                            this.status = status;
                        }
                    }
                }
            }

            public static class RepairSkillsBeanX {
                /**
                 * utime : 2019-04-22 14:34:20
                 * creater : Admin
                 * ctime : 2019-04-22 14:34:20
                 * id : 627
                 * brand : {"brandName":"Bosch高压共轨泵","utime":"2019-4-24 15:41:25","creater":"admin","typeName":"发动机","ctime":"2019-4-24 15:41:25","id":1,"status":1}
                 * status : 1
                 */

                private String utime;
                private String creater;
                private String ctime;
                private int id;
                private BrandBeanX brand;
                private int status;

                public String getUtime() {
                    return utime;
                }

                public void setUtime(String utime) {
                    this.utime = utime;
                }

                public String getCreater() {
                    return creater;
                }

                public void setCreater(String creater) {
                    this.creater = creater;
                }

                public String getCtime() {
                    return ctime;
                }

                public void setCtime(String ctime) {
                    this.ctime = ctime;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public BrandBeanX getBrand() {
                    return brand;
                }

                public void setBrand(BrandBeanX brand) {
                    this.brand = brand;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public static class BrandBeanX {
                    /**
                     * brandName : Bosch高压共轨泵
                     * utime : 2019-4-24 15:41:25
                     * creater : admin
                     * typeName : 发动机
                     * ctime : 2019-4-24 15:41:25
                     * id : 1
                     * status : 1
                     */

                    private String brandName;
                    private String utime;
                    private String creater;
                    private String typeName;
                    private String ctime;
                    private int id;
                    private int status;

                    public String getBrandName() {
                        return brandName;
                    }

                    public void setBrandName(String brandName) {
                        this.brandName = brandName;
                    }

                    public String getUtime() {
                        return utime;
                    }

                    public void setUtime(String utime) {
                        this.utime = utime;
                    }

                    public String getCreater() {
                        return creater;
                    }

                    public void setCreater(String creater) {
                        this.creater = creater;
                    }

                    public String getTypeName() {
                        return typeName;
                    }

                    public void setTypeName(String typeName) {
                        this.typeName = typeName;
                    }

                    public String getCtime() {
                        return ctime;
                    }

                    public void setCtime(String ctime) {
                        this.ctime = ctime;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }
                }
            }
        }
}
