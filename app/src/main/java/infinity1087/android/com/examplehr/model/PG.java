package infinity1087.android.com.examplehr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PG implements Serializable {

    @SerializedName("$id")
    @Expose
    private String $id;
    @SerializedName("ProductGroupId")
    @Expose
    private Integer productGroupId;
    @SerializedName("ProductGroupName")
    @Expose
    private String productGroupName;
    @SerializedName("ProductGroupIcon")
    @Expose
    private Object productGroupIcon;
    @SerializedName("ProductGroupImage")
    @Expose
    private Object productGroupImage;
    @SerializedName("ProductGroupLink")
    @Expose
    private Object productGroupLink;
    @SerializedName("ProductGroupBannerImage")
    @Expose
    private Object productGroupBannerImage;
    @SerializedName("ProductGroupBannerLink")
    @Expose
    private Object productGroupBannerLink;
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
    @SerializedName("$ref")
    @Expose
    private String $ref;

    public String get$id() {
        return $id;
    }

    public void set$id(String $id) {
        this.$id = $id;
    }

    public Integer getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(Integer productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public Object getProductGroupIcon() {
        return productGroupIcon;
    }

    public void setProductGroupIcon(Object productGroupIcon) {
        this.productGroupIcon = productGroupIcon;
    }

    public Object getProductGroupImage() {
        return productGroupImage;
    }

    public void setProductGroupImage(Object productGroupImage) {
        this.productGroupImage = productGroupImage;
    }

    public Object getProductGroupLink() {
        return productGroupLink;
    }

    public void setProductGroupLink(Object productGroupLink) {
        this.productGroupLink = productGroupLink;
    }

    public Object getProductGroupBannerImage() {
        return productGroupBannerImage;
    }

    public void setProductGroupBannerImage(Object productGroupBannerImage) {
        this.productGroupBannerImage = productGroupBannerImage;
    }

    public Object getProductGroupBannerLink() {
        return productGroupBannerLink;
    }

    public void setProductGroupBannerLink(Object productGroupBannerLink) {
        this.productGroupBannerLink = productGroupBannerLink;
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

    public String get$ref() {
        return $ref;
    }

    public void set$ref(String $ref) {
        this.$ref = $ref;
    }
}
