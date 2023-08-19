package top.gabin.tools.response.tool;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import top.gabin.tools.response.AbstractResponse;

import java.util.List;
import java.util.Map;

@Data
public class BankingResponse extends AbstractResponse {

    @JsonProperty(value = "total_count")
    private Integer totalCount;
    private Integer count;
    private Integer offset;
    private List<BankingItem> data;
    private Map<String, String> links;


    @Data
    public static class BankingItem {

        @JsonProperty(value = "account_bank")
        private String accountBank;
        @JsonProperty(value = "account_bank_code")
        private Integer accountBankCode;
        @JsonProperty(value = "bank_alias")
        private String bankAlias;
        @JsonProperty(value = "bank_alias_code")
        private Integer bankAliasCode;
        @JsonProperty(value = "need_bank_branch")
        private Boolean needBankBranch;
    }

    @Data
    public static class Links {

        private String next;
        private String prev;
        private String self;
    }


}
