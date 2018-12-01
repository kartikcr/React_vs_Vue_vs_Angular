# Generated by Django 2.1.3 on 2018-11-25 01:33

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('pyapi', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Article',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.TextField()),
                ('author', models.TextField()),
                ('article', models.TextField()),
            ],
        ),
        migrations.CreateModel(
            name='Car',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('company', models.TextField()),
                ('model', models.TextField()),
                ('price', models.BigIntegerField()),
            ],
        ),
        migrations.CreateModel(
            name='ImageTable',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('image_url', models.TextField()),
            ],
        ),
        migrations.DeleteModel(
            name='Users',
        ),
    ]