package com.example.kotlinspringboothandleconstraintviolation.presentation.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 単一記事のレスポンスモデル
 *
 * @property slug 記事の slug
 * @property title 記事のタイトル
 * @property description 記事の説明
 * @property body 記事の本文
 */
data class Article(
    @field:JsonProperty("slug", required = true) val slug: String,

    @field:JsonProperty("title", required = true) val title: String,

    @field:JsonProperty("description", required = true) val description: String,

    @field:JsonProperty("body", required = true) val body: String,
)
