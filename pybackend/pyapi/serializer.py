from rest_framework import serializers
from .models import *


class ArticleSerializer(serializers.ModelSerializer):
    class Meta:
        model = Article
        fields=('title', 'author', 'article')


class CarSerializer(serializers.ModelSerializer):
    class Meta:
        model = Car
        fields = ('company', 'model', 'price')


class ArticleSerializer(serializers.ModelSerializer):
    class Meta:
        model = Article
        fields = ('title', 'author', 'article')


class ImageTableSerializer(serializers.ModelSerializer):
    class Meta:
        model = ImageTable
        fields = ('image_url','image_alt_text')
