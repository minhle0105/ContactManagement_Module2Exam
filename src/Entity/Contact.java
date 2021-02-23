package Entity;

public class Contact {
      private String name;
      private String phoneNumber;
      private String address;
      private String gender;
      private String group;

      /**
       * @return the name
       */
      public String getName() {
            return name;
      }

      /**
       * @param name the name to set
       */
      public void setName(String name) {
            this.name = name;
      }

      /**
       * @return the phoneNumber
       */
      public String getPhoneNumber() {
            return phoneNumber;
      }

      /**
       * @param phoneNumber the phoneNumber to set
       */
      public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      /**
       * @return the address
       */
      public String getAddress() {
            return address;
      }

      /**
       * @param address the address to set
       */
      public void setAddress(String address) {
            this.address = address;
      }

      /**
       * @return the gender
       */
      public String getGender() {
            return gender;
      }

      /**
       * @param gender the gender to set
       */
      public void setGender(String gender) {
            this.gender = gender;
      }

      /**
       * @return the group
       */
      public String getGroup() {
            return group;
      }

      /**
       * @param group the group to set
       */
      public void setGroup(String group) {
            this.group = group;
      }

      /**
       * 
       */
      public Contact() {
      }

      /**
       * @param name
       * @param phoneNumber
       * @param address
       * @param gender
       * @param group
       */
      public Contact(String name, String phoneNumber, String address, String gender, String group) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.gender = gender;
            this.group = group;
      }

      /*
       * (non-Javadoc)
       * 
       * @see java.lang.Object#toString()
       */

      @Override
      public String toString() {
            return "Contact [name = " + name + ", gender = " + gender + ", address = " + address + ", phoneNumber = " + phoneNumber + ", group = " + group + "]";
      }

      
}
