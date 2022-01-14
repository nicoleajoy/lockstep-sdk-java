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


public class InviteDataModel
{
    private String email;
    private String userStatus;

    /**
     * @return The email address of the invited user.
     */
    public String getEmail() { return this.email; }
    /**
     * @param value - The email address of the invited user.
     */
    public void setEmail(String value) { this.email = value; }
    /**
     * @return The status of the user.
     */
    public String getUserStatus() { return this.userStatus; }
    /**
     * @param value - The status of the user.
     */
    public void setUserStatus(String value) { this.userStatus = value; }
};
