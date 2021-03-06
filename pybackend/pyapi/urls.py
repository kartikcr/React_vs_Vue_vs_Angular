from django.conf.urls import url, include
from rest_framework.urlpatterns import format_suffix_patterns
from .views import *

urlpatterns = {
    url(r'^articles/$', ArticleView.as_view(), name="create"),
    url(r'^cars/$', CarView.as_view(), name="create"),
    url(r'^images/$', ImageTableView.as_view(), name="create"),
}

urlpatterns = format_suffix_patterns(urlpatterns)
