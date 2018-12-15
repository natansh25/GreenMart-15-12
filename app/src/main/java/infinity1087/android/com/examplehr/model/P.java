package infinity1087.android.com.examplehr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class P implements Serializable {
    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductGroupId")
    @Expose
    private Integer productGroupId;
    @SerializedName("BrandId")
    @Expose
    private Integer brandId;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("ProductDescription")
    @Expose
    private String productDescription;
    @SerializedName("ProductTImage")
    @Expose
    private Object productTImage;
    @SerializedName("ProductCImage")
    @Expose
    private Object productCImage;
    @SerializedName("ProductImage")
    @Expose
    private String productImage;
    @SerializedName("OfferText")
    @Expose
    private String offerText;
    @SerializedName("IsSeasonal")
    @Expose
    private Object isSeasonal;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("IsDisplay")
    @Expose
    private Boolean isDisplay;
    @SerializedName("IsAddedOn")
    @Expose
    private Object isAddedOn;
    @SerializedName("IsUpdatedOn")
    @Expose
    private Object isUpdatedOn;
    @SerializedName("CreatedBy")
    @Expose
    private Object createdBy;
    @SerializedName("UpdatedBy")
    @Expose
    private Object updatedBy;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(Integer productGroupId) {
        this.productGroupId = productGroupId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Object getProductTImage() {
        return productTImage;
    }

    public void setProductTImage(Object productTImage) {
        this.productTImage = productTImage;
    }

    public Object getProductCImage() {
        return productCImage;
    }

    public void setProductCImage(Object productCImage) {
        this.productCImage = productCImage;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getOfferText() {
        return offerText;
    }

    public void setOfferText(String offerText) {
        this.offerText = offerText;
    }

    public Object getIsSeasonal() {
        return isSeasonal;
    }

    public void setIsSeasonal(Object isSeasonal) {
        this.isSeasonal = isSeasonal;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Object getIsAddedOn() {
        return isAddedOn;
    }

    public void setIsAddedOn(Object isAddedOn) {
        this.isAddedOn = isAddedOn;
    }

    public Object getIsUpdatedOn() {
        return isUpdatedOn;
    }

    public void setIsUpdatedOn(Object isUpdatedOn) {
        this.isUpdatedOn = isUpdatedOn;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }
}
