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


public class ProvisioningModel
{
    private String fullName;
    private ErpInfoModel erp;

    /**
     * @return The full name of the new user
     */
    public String getFullName() { return this.fullName; }
    /**
     * @param value - The full name of the new user
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * @return The information necessary to enroll the user in their ERP
     */
    public ErpInfoModel getErp() { return this.erp; }
    /**
     * @param value - The information necessary to enroll the user in their ERP
     */
    public void setErp(ErpInfoModel value) { this.erp = value; }
};
