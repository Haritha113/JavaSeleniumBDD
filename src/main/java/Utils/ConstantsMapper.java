package Utils;


import java.util.HashMap;
import java.util.Map;

public class ConstantsMapper {

    private static final Map<String, String> constants = Map.of(
            "ADMIN_TAB", AppConstants.ADMIN,
            "PIM_TAB", AppConstants.PIM,
            "ADMIN", AppConstants.ROLE_ADMIN,
            "ESS", AppConstants.ROLE_ESS,
            "ENABLED", AppConstants.STATUS_ENABLED,
            "DISABLED", AppConstants.STATUS_DISABLED
    );

    public static String resolve(String key) {
        return constants.getOrDefault(key, key);
    }
}

