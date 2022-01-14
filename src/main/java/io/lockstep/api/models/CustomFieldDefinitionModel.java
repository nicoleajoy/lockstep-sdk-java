/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.2
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class CustomFieldDefinitionModel
{
    private String groupKey;
    private String customFieldDefinitionId;
    private String tableKey;
    private String appId;
    private String customFieldLabel;
    private String dataType;
    private Integer sortOrder;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private String appEnrollmentId;

    /**
     * @return The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getGroupKey() { return this.groupKey; }
    /**
     * @param value - The GroupKey uniquely identifies a single Lockstep Platform account. All records for this account will share the same GroupKey value. GroupKey values cannot be changed once created. For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setGroupKey(String value) { this.groupKey = value; }
    /**
     * @return The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public String getCustomFieldDefinitionId() { return this.customFieldDefinitionId; }
    /**
     * @param value - The unique ID of this record, automatically assigned by Lockstep when this record is added to the Lockstep platform.
     */
    public void setCustomFieldDefinitionId(String value) { this.customFieldDefinitionId = value; }
    /**
     * @return Table to which this definition belongs
     */
    public String getTableKey() { return this.tableKey; }
    /**
     * @param value - Table to which this definition belongs
     */
    public void setTableKey(String value) { this.tableKey = value; }
    /**
     * @return Id of app this definition belongs to
     */
    public String getAppId() { return this.appId; }
    /**
     * @param value - Id of app this definition belongs to
     */
    public void setAppId(String value) { this.appId = value; }
    /**
     * @return Text to display in-application for custom field
     */
    public String getCustomFieldLabel() { return this.customFieldLabel; }
    /**
     * @param value - Text to display in-application for custom field
     */
    public void setCustomFieldLabel(String value) { this.customFieldLabel = value; }
    /**
     * @return Data type of this definition
     */
    public String getDataType() { return this.dataType; }
    /**
     * @param value - Data type of this definition
     */
    public void setDataType(String value) { this.dataType = value; }
    /**
     * @return Used for display logic when multiple custom fields exist
     */
    public Integer getSortOrder() { return this.sortOrder; }
    /**
     * @param value - Used for display logic when multiple custom fields exist
     */
    public void setSortOrder(Integer value) { this.sortOrder = value; }
    /**
     * @return Date created
     */
    public Date getCreated() { return this.created; }
    /**
     * @param value - Date created
     */
    public void setCreated(Date value) { this.created = value; }
    /**
     * @return Id of user who created this definition
     */
    public String getCreatedUserId() { return this.createdUserId; }
    /**
     * @param value - Id of user who created this definition
     */
    public void setCreatedUserId(String value) { this.createdUserId = value; }
    /**
     * @return Date modified
     */
    public Date getModified() { return this.modified; }
    /**
     * @param value - Date modified
     */
    public void setModified(Date value) { this.modified = value; }
    /**
     * @return Id of user who modified this definition
     */
    public String getModifiedUserId() { return this.modifiedUserId; }
    /**
     * @param value - Id of user who modified this definition
     */
    public void setModifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * @return AppEnrollmentId for this record; used for mapping purposes.
     */
    public String getAppEnrollmentId() { return this.appEnrollmentId; }
    /**
     * @param value - AppEnrollmentId for this record; used for mapping purposes.
     */
    public void setAppEnrollmentId(String value) { this.appEnrollmentId = value; }
};
