package njit.JerSE.models;

/**
 * Provides details about the token usage for a ChatGPT API request and response.
 * <p>
 * Given the API's billing and computational considerations, tracking token usage is crucial.
 *
 * <p><strong>Note:</strong> It's important that the field names remain in snake_case for API compatibility.
 *
 * @param prompt_tokens      the number of tokens used in the input prompt
 * @param completion_tokens  the number of tokens used in the APIs response or completion
 * @param total_tokens       the total number of tokens used, typically the sum of prompt and completion tokens
 */
public record GPTUsage(
        int prompt_tokens,
        int completion_tokens,
        int total_tokens
) {}
