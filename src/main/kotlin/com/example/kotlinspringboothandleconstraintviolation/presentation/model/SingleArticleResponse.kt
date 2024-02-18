package com.example.kotlinspringboothandleconstraintviolation.presentation.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.Valid

/**
 * 単一記事取得のレスポンス
 *
 * @property article 作成済み記事
 */
data class SingleArticleResponse(
    @field:Valid
    @field:JsonProperty("article", required = true) val article: Article
)
