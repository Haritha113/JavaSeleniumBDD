package Utils;


import java.util.HashMap;
import java.util.Map;

public class ConstantsMapper {

    private static final Map<String, String> constants = Map.of(
            "ADMIN_TAB", AppConstants.ADMIN,
            "PIM_TAB", AppConstants.PIM,
            "ROLE_ADMIN", AppConstants.ROLE_ADMIN,
            "ROLE_ESS", AppConstants.ROLE_ESS,
            "STATUS_ENABLED", AppConstants.STATUS_ENABLED,
            "STATUS_DISABLED", AppConstants.STATUS_DISABLED
    );

    public static String resolve(String key) {
        return constants.getOrDefault(key, key);
    }
}

