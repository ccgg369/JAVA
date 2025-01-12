package com.greenplatform.model;

import java.util.ArrayList;
import java.util.List;

public class PlateUserRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public PlateUserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNRoleIsNull() {
            addCriterion("N_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andNRoleIsNotNull() {
            addCriterion("N_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andNRoleEqualTo(String value) {
            addCriterion("N_ROLE =", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleNotEqualTo(String value) {
            addCriterion("N_ROLE <>", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleGreaterThan(String value) {
            addCriterion("N_ROLE >", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleGreaterThanOrEqualTo(String value) {
            addCriterion("N_ROLE >=", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleLessThan(String value) {
            addCriterion("N_ROLE <", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleLessThanOrEqualTo(String value) {
            addCriterion("N_ROLE <=", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleLike(String value) {
            addCriterion("N_ROLE like", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleNotLike(String value) {
            addCriterion("N_ROLE not like", value, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleIn(List<String> values) {
            addCriterion("N_ROLE in", values, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleNotIn(List<String> values) {
            addCriterion("N_ROLE not in", values, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleBetween(String value1, String value2) {
            addCriterion("N_ROLE between", value1, value2, "nRole");
            return (Criteria) this;
        }

        public Criteria andNRoleNotBetween(String value1, String value2) {
            addCriterion("N_ROLE not between", value1, value2, "nRole");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNull() {
            addCriterion("C_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNotNull() {
            addCriterion("C_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCUseridEqualTo(Integer value) {
            addCriterion("C_USERID =", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotEqualTo(Integer value) {
            addCriterion("C_USERID <>", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThan(Integer value) {
            addCriterion("C_USERID >", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_USERID >=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThan(Integer value) {
            addCriterion("C_USERID <", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThanOrEqualTo(Integer value) {
            addCriterion("C_USERID <=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridIn(List<Integer> values) {
            addCriterion("C_USERID in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotIn(List<Integer> values) {
            addCriterion("C_USERID not in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridBetween(Integer value1, Integer value2) {
            addCriterion("C_USERID between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("C_USERID not between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCRolenameIsNull() {
            addCriterion("C_ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andCRolenameIsNotNull() {
            addCriterion("C_ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCRolenameEqualTo(String value) {
            addCriterion("C_ROLENAME =", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameNotEqualTo(String value) {
            addCriterion("C_ROLENAME <>", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameGreaterThan(String value) {
            addCriterion("C_ROLENAME >", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ROLENAME >=", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameLessThan(String value) {
            addCriterion("C_ROLENAME <", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameLessThanOrEqualTo(String value) {
            addCriterion("C_ROLENAME <=", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameLike(String value) {
            addCriterion("C_ROLENAME like", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameNotLike(String value) {
            addCriterion("C_ROLENAME not like", value, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameIn(List<String> values) {
            addCriterion("C_ROLENAME in", values, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameNotIn(List<String> values) {
            addCriterion("C_ROLENAME not in", values, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameBetween(String value1, String value2) {
            addCriterion("C_ROLENAME between", value1, value2, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCRolenameNotBetween(String value1, String value2) {
            addCriterion("C_ROLENAME not between", value1, value2, "cRolename");
            return (Criteria) this;
        }

        public Criteria andCZtIsNull() {
            addCriterion("C_ZT is null");
            return (Criteria) this;
        }

        public Criteria andCZtIsNotNull() {
            addCriterion("C_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andCZtEqualTo(Integer value) {
            addCriterion("C_ZT =", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotEqualTo(Integer value) {
            addCriterion("C_ZT <>", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThan(Integer value) {
            addCriterion("C_ZT >", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ZT >=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThan(Integer value) {
            addCriterion("C_ZT <", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThanOrEqualTo(Integer value) {
            addCriterion("C_ZT <=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtIn(List<Integer> values) {
            addCriterion("C_ZT in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotIn(List<Integer> values) {
            addCriterion("C_ZT not in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtBetween(Integer value1, Integer value2) {
            addCriterion("C_ZT between", value1, value2, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ZT not between", value1, value2, "cZt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_role
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}