package gw.gobpo2005.rawg.main_page.api.model

import com.google.gson.annotations.SerializedName

data class FiltersDataResponse(
    @SerializedName("years")
    val years: List<YearsDataResponse>
)