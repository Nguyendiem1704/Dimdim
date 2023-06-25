/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheckValidator;

import Model.Customer;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class DataValidator {
        private DataValidator(){};
        public static final String customer_id_regex = "KH\\d{2}";
        public static final String phone_regex = "09\\d{8}";
        public static final String date_format = "dd/MM/yyyy";
        public static final String date_regex = "^\\d{2}/\\d{2}/\\d{4}$";
        public static final String Regex_number = "[0-9]+";
        public static final String REGEX_Phone_Number = "0[0-9]{9}";
        public static final String REGEX_Name = "[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+((\\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+)+)?";
        private static Iterable<Customer> customers;

        public static boolean checkRegex(String str, String regex) {
            return str.matches(regex);
        }
        public static boolean validateDateOfBirth(String dateOfBirth) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(date_format);
            dateFormat.setLenient(false);

            try {
                dateFormat.parse(dateOfBirth);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
}
