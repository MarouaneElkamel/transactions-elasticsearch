package kaoun.flouci.transactions.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of TransactionSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class TransactionSearchRepositoryMockConfiguration {

    @MockBean
    private TransactionSearchRepository mockTransactionSearchRepository;

}
