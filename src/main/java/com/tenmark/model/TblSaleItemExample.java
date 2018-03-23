package com.tenmark.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblSaleItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblSaleItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("series_id is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("series_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Long value) {
            addCriterion("series_id =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Long value) {
            addCriterion("series_id <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Long value) {
            addCriterion("series_id >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("series_id >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Long value) {
            addCriterion("series_id <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Long value) {
            addCriterion("series_id <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Long> values) {
            addCriterion("series_id in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Long> values) {
            addCriterion("series_id not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Long value1, Long value2) {
            addCriterion("series_id between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Long value1, Long value2) {
            addCriterion("series_id not between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIsNull() {
            addCriterion("selling_points is null");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIsNotNull() {
            addCriterion("selling_points is not null");
            return (Criteria) this;
        }

        public Criteria andSellingPointsEqualTo(String value) {
            addCriterion("selling_points =", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotEqualTo(String value) {
            addCriterion("selling_points <>", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsGreaterThan(String value) {
            addCriterion("selling_points >", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsGreaterThanOrEqualTo(String value) {
            addCriterion("selling_points >=", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLessThan(String value) {
            addCriterion("selling_points <", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLessThanOrEqualTo(String value) {
            addCriterion("selling_points <=", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsLike(String value) {
            addCriterion("selling_points like", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotLike(String value) {
            addCriterion("selling_points not like", value, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsIn(List<String> values) {
            addCriterion("selling_points in", values, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotIn(List<String> values) {
            addCriterion("selling_points not in", values, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsBetween(String value1, String value2) {
            addCriterion("selling_points between", value1, value2, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andSellingPointsNotBetween(String value1, String value2) {
            addCriterion("selling_points not between", value1, value2, "sellingPoints");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceIsNull() {
            addCriterion("min_originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceIsNotNull() {
            addCriterion("min_originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceEqualTo(Double value) {
            addCriterion("min_originalPrice =", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceNotEqualTo(Double value) {
            addCriterion("min_originalPrice <>", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceGreaterThan(Double value) {
            addCriterion("min_originalPrice >", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_originalPrice >=", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceLessThan(Double value) {
            addCriterion("min_originalPrice <", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceLessThanOrEqualTo(Double value) {
            addCriterion("min_originalPrice <=", value, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceIn(List<Double> values) {
            addCriterion("min_originalPrice in", values, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceNotIn(List<Double> values) {
            addCriterion("min_originalPrice not in", values, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceBetween(Double value1, Double value2) {
            addCriterion("min_originalPrice between", value1, value2, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalpriceNotBetween(Double value1, Double value2) {
            addCriterion("min_originalPrice not between", value1, value2, "minOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceIsNull() {
            addCriterion("max_originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceIsNotNull() {
            addCriterion("max_originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceEqualTo(Double value) {
            addCriterion("max_originalPrice =", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceNotEqualTo(Double value) {
            addCriterion("max_originalPrice <>", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceGreaterThan(Double value) {
            addCriterion("max_originalPrice >", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("max_originalPrice >=", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceLessThan(Double value) {
            addCriterion("max_originalPrice <", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceLessThanOrEqualTo(Double value) {
            addCriterion("max_originalPrice <=", value, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceIn(List<Double> values) {
            addCriterion("max_originalPrice in", values, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceNotIn(List<Double> values) {
            addCriterion("max_originalPrice not in", values, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceBetween(Double value1, Double value2) {
            addCriterion("max_originalPrice between", value1, value2, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalpriceNotBetween(Double value1, Double value2) {
            addCriterion("max_originalPrice not between", value1, value2, "maxOriginalprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceIsNull() {
            addCriterion("min_discountPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceIsNotNull() {
            addCriterion("min_discountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceEqualTo(Double value) {
            addCriterion("min_discountPrice =", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceNotEqualTo(Double value) {
            addCriterion("min_discountPrice <>", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceGreaterThan(Double value) {
            addCriterion("min_discountPrice >", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("min_discountPrice >=", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceLessThan(Double value) {
            addCriterion("min_discountPrice <", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceLessThanOrEqualTo(Double value) {
            addCriterion("min_discountPrice <=", value, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceIn(List<Double> values) {
            addCriterion("min_discountPrice in", values, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceNotIn(List<Double> values) {
            addCriterion("min_discountPrice not in", values, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceBetween(Double value1, Double value2) {
            addCriterion("min_discountPrice between", value1, value2, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinDiscountpriceNotBetween(Double value1, Double value2) {
            addCriterion("min_discountPrice not between", value1, value2, "minDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceIsNull() {
            addCriterion("max_discountPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceIsNotNull() {
            addCriterion("max_discountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceEqualTo(Double value) {
            addCriterion("max_discountPrice =", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceNotEqualTo(Double value) {
            addCriterion("max_discountPrice <>", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceGreaterThan(Double value) {
            addCriterion("max_discountPrice >", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("max_discountPrice >=", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceLessThan(Double value) {
            addCriterion("max_discountPrice <", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceLessThanOrEqualTo(Double value) {
            addCriterion("max_discountPrice <=", value, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceIn(List<Double> values) {
            addCriterion("max_discountPrice in", values, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceNotIn(List<Double> values) {
            addCriterion("max_discountPrice not in", values, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceBetween(Double value1, Double value2) {
            addCriterion("max_discountPrice between", value1, value2, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMaxDiscountpriceNotBetween(Double value1, Double value2) {
            addCriterion("max_discountPrice not between", value1, value2, "maxDiscountprice");
            return (Criteria) this;
        }

        public Criteria andMinVolumeIsNull() {
            addCriterion("min_volume is null");
            return (Criteria) this;
        }

        public Criteria andMinVolumeIsNotNull() {
            addCriterion("min_volume is not null");
            return (Criteria) this;
        }

        public Criteria andMinVolumeEqualTo(Double value) {
            addCriterion("min_volume =", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeNotEqualTo(Double value) {
            addCriterion("min_volume <>", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeGreaterThan(Double value) {
            addCriterion("min_volume >", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("min_volume >=", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeLessThan(Double value) {
            addCriterion("min_volume <", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeLessThanOrEqualTo(Double value) {
            addCriterion("min_volume <=", value, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeIn(List<Double> values) {
            addCriterion("min_volume in", values, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeNotIn(List<Double> values) {
            addCriterion("min_volume not in", values, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeBetween(Double value1, Double value2) {
            addCriterion("min_volume between", value1, value2, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMinVolumeNotBetween(Double value1, Double value2) {
            addCriterion("min_volume not between", value1, value2, "minVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIsNull() {
            addCriterion("max_volume is null");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIsNotNull() {
            addCriterion("max_volume is not null");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeEqualTo(Double value) {
            addCriterion("max_volume =", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotEqualTo(Double value) {
            addCriterion("max_volume <>", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeGreaterThan(Double value) {
            addCriterion("max_volume >", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("max_volume >=", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeLessThan(Double value) {
            addCriterion("max_volume <", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeLessThanOrEqualTo(Double value) {
            addCriterion("max_volume <=", value, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeIn(List<Double> values) {
            addCriterion("max_volume in", values, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotIn(List<Double> values) {
            addCriterion("max_volume not in", values, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeBetween(Double value1, Double value2) {
            addCriterion("max_volume between", value1, value2, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andMaxVolumeNotBetween(Double value1, Double value2) {
            addCriterion("max_volume not between", value1, value2, "maxVolume");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIsNull() {
            addCriterion("raw_material is null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIsNotNull() {
            addCriterion("raw_material is not null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialEqualTo(String value) {
            addCriterion("raw_material =", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotEqualTo(String value) {
            addCriterion("raw_material <>", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialGreaterThan(String value) {
            addCriterion("raw_material >", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("raw_material >=", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLessThan(String value) {
            addCriterion("raw_material <", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLessThanOrEqualTo(String value) {
            addCriterion("raw_material <=", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLike(String value) {
            addCriterion("raw_material like", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotLike(String value) {
            addCriterion("raw_material not like", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIn(List<String> values) {
            addCriterion("raw_material in", values, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotIn(List<String> values) {
            addCriterion("raw_material not in", values, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialBetween(String value1, String value2) {
            addCriterion("raw_material between", value1, value2, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotBetween(String value1, String value2) {
            addCriterion("raw_material not between", value1, value2, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andPackingIsNull() {
            addCriterion("packing is null");
            return (Criteria) this;
        }

        public Criteria andPackingIsNotNull() {
            addCriterion("packing is not null");
            return (Criteria) this;
        }

        public Criteria andPackingEqualTo(String value) {
            addCriterion("packing =", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotEqualTo(String value) {
            addCriterion("packing <>", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThan(String value) {
            addCriterion("packing >", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThanOrEqualTo(String value) {
            addCriterion("packing >=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThan(String value) {
            addCriterion("packing <", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThanOrEqualTo(String value) {
            addCriterion("packing <=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLike(String value) {
            addCriterion("packing like", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotLike(String value) {
            addCriterion("packing not like", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingIn(List<String> values) {
            addCriterion("packing in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotIn(List<String> values) {
            addCriterion("packing not in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingBetween(String value1, String value2) {
            addCriterion("packing between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotBetween(String value1, String value2) {
            addCriterion("packing not between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNull() {
            addCriterion("technology is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNotNull() {
            addCriterion("technology is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyEqualTo(String value) {
            addCriterion("technology =", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotEqualTo(String value) {
            addCriterion("technology <>", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThan(String value) {
            addCriterion("technology >", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("technology >=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThan(String value) {
            addCriterion("technology <", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThanOrEqualTo(String value) {
            addCriterion("technology <=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLike(String value) {
            addCriterion("technology like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotLike(String value) {
            addCriterion("technology not like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyIn(List<String> values) {
            addCriterion("technology in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotIn(List<String> values) {
            addCriterion("technology not in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyBetween(String value1, String value2) {
            addCriterion("technology between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotBetween(String value1, String value2) {
            addCriterion("technology not between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(String value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(String value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(String value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(String value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(String value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLike(String value) {
            addCriterion("inventory like", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotLike(String value) {
            addCriterion("inventory not like", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<String> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<String> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(String value1, String value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(String value1, String value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterion("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterion("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterion("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterion("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterion("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterion("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterion("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterion("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterion("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("seo_title is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("seo_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("seo_title =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("seo_title <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("seo_title >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seo_title >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("seo_title <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("seo_title <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("seo_title like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("seo_title not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("seo_title in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("seo_title not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("seo_title between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("seo_title not between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seo_description is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seo_description =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seo_description <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seo_description >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seo_description >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seo_description <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seo_description <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seo_description like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seo_description not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seo_description in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seo_description not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seo_description between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seo_description not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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